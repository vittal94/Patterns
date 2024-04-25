package org.example.kotlinCode.AbstructFactory.Weapon

import org.example.kotlinCode.AbstructFactory.gameState.Piece

fun testWeapon()
{
    val katanaFactory: WeaponFactory = Katana.Factory
    val katana: Weapon = katanaFactory.buildWeapon()
    katana.use()

    val crossbow: Weapon = Crossbow.buildWeapon()
    crossbow.use()
}
