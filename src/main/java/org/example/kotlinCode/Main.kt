package org.example.kotlinCode

import org.example.kotlinCode.AbstructFactory.Weapon.testWeapon
import org.example.kotlinCode.AbstructFactory.gameState.testGameState
import org.example.kotlinCode.Adapter.bureau.testBureau
import org.example.kotlinCode.Bridge.scoring.TestScoring
import org.example.kotlinCode.FactoryMethod.BankCard.BankApp
import org.example.kotlinCode.Singelton.GameConfig.testGameConfig
import org.example.kotlinCode.builder.person.testPerson
import org.example.kotlinCode.composite.movieComponent.movieService
import org.example.kotlinCode.decorator.logginMap.testLoggedOperationMap

fun main() {

    //BankApp.run()
   // testWeapon()
  // testGameState()
   //testGameConfig()
//testPerson()
//testBureau()
    //TestScoring.run()
    //movieService()
    testLoggedOperationMap()
}

