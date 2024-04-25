package org.example.kotlinCode.AbstructFactory.Weapon

class Crossbow : Weapon
{
    override fun use()
    {
        println("Weapon crossbow in action...")
    }

    companion object Factory : WeaponFactory
    {
        override fun buildWeapon(): Weapon = Crossbow()

    }
}

class Katana : Weapon {
    override fun use() {
        println("Weapon Katana in action...")
    }

    companion object Factory : WeaponFactory {
        override fun buildWeapon(): Weapon {
            return Katana()
        }

    }
}