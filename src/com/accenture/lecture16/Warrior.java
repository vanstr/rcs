package com.accenture.lecture16;

public class Warrior {

	private static final int MAX_HEALTH = 100;
	private String name;
	private int health;
	private int damagePower;

	public Warrior(String name, int initialHealth, int damagePower) {
		this.name = name;
		if (initialHealth > MAX_HEALTH) {
			initialHealth = MAX_HEALTH;
		} else if (initialHealth < 1) {
			initialHealth = 1;
		}
		this.health = initialHealth;
		if (damagePower > MAX_HEALTH) {
			damagePower = MAX_HEALTH;
		} else if (damagePower < 1) {
			damagePower = 1;
		}
		this.damagePower = damagePower;
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public int getDamagePower() {
		return damagePower;
	}

	private boolean isAlive() {
		return health > 0 ? true : false;
	}

	public void receivedDamage(int damage) {
		if (isAlive()) {
			if (damage > 0) {
				if (health - damage > 0) {
					health -= damage;
				} else {
					health = 0;
				}
			} else {
				System.out.println("The planned damage is not valid.");
			}
		}
	}

	public void restoreHealth(int healthPortion) {
		if (isAlive()) {
			if (healthPortion > 0) {
				if (health + healthPortion < MAX_HEALTH) {
					health += healthPortion;
				} else {
					health = MAX_HEALTH;
					System.out.print("The maximum health of " + name + " is now set to maximum value: " + MAX_HEALTH);
				}
			} else {
				System.out.println("The planned action is not valid.");
			}
		}
	}

	public void fight(Warrior anotherWarrior) {
		System.out.println("This is fight is between: " + this + " and " + anotherWarrior);
		while (isAlive() && anotherWarrior.isAlive()) {
			System.out.println(this.name + " attacked " + anotherWarrior.getName());
			anotherWarrior.receivedDamage(this.damagePower);
			System.out.println(anotherWarrior);
			if (isAlive() && anotherWarrior.isAlive()) {
				System.out.println(anotherWarrior.getName() + " attacked " + this.name);
				receivedDamage(anotherWarrior.getDamagePower());
				System.out.println(toString());
			}
		}
		if (!isAlive()) {
			System.out.println("Fight is finished! Winner:" + anotherWarrior.getName() + " loose: " + getName());
		} else {
			System.out.println("Fight is finished! Winner:" + getName() + " loose: " + anotherWarrior.getName());
		}
	}

	@Override
	public String toString() {
		if (isAlive()) {
			return "Warrior: " + this.name + ", health: " + this.health + " damage: " + this.damagePower;
		} else {
			return "Warrior: " + this.name + " is dead";
		}
	}
}