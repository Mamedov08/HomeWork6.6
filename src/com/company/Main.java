package com.company;

public class Main {

    public static void main(String[] args) {
        Boss pitStop = new Boss();
        pitStop.setHealth(564);
        pitStop.setDamage(654);
        pitStop.getWeapon().setWeapon(WeaponType.AK57);
        pitStop.getWeapon().setWeaponType("Огнестрельное");
        System.out.println(pitStop.info());

        Skeleton skelet = new Skeleton();
        skelet.setHealth(455);
        skelet.setDamage(745);
        skelet.getWeapon().setWeapon(WeaponType.BERIL707);
        skelet.getWeapon().setWeaponType("Огнестрельное");
        System.out.println(skelet.info());

        Skeleton and = new Skeleton();
        and.setHealth(436);
        and.setDamage(715);
        and.getWeapon().setWeapon(WeaponType.BERIL707);
        and.getWeapon().setWeaponType("Огнестрельное");
        System.out.println(and.info());
    }

}
