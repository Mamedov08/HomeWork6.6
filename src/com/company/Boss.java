package com.company;

public class Boss extends GameEntity {
    Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String info() {
        return " Урон босса " + getDamage() + "\n Здоровье босса " + getHealth() + "\n Тип оружье босса: " + weapon.getWeaponType()
                + "\n Оружье: " + weapon.getWeapon();


    }
}
