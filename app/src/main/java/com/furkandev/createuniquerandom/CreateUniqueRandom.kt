package com.furkandev.createuniquerandom

import kotlin.random.Random

class CreateUniqueRandom {

    /**
        * minRange = The smallest value of the range to be randomly generated
        * maxRange = The biggest value of the range to be randomly generated
        * totalReturnedValueCount = The total number of values ​​of the value to be returned

        * There are some things I suggest you don't do;
        1. The maxValue value you enter can never be less than the minValue value.
        2. The totalReturnedValueCount value you entered can never be greater than or equal to the difference of maxValue and minValue values.

        * If you are outputting 0 or 0.0 values ​​each time. Browse LogCat by applying System.out filter

        If you want more details you can check here;
        https://github.com/frkncs/CreteUniqueRandom
     */

    fun int(minRange: Int, maxRange: Int, totalReturnedValueCount: Int): IntArray {

        if (minRange > maxRange || maxRange - minRange <= totalReturnedValueCount){
            println("This is impossible or may crash the app!")
        }
        else{
            val returnArray = IntArray(totalReturnedValueCount)

            var randomNumber = 0

            for (i in 0..totalReturnedValueCount-1) {

                randomNumber = Random.nextInt(minRange,maxRange)

                if (i == 0){
                    returnArray[i] = randomNumber
                }
                else{
                    while (true){
                        randomNumber = Random.nextInt(minRange,maxRange)

                        if (isUnique(returnArray,randomNumber)){
                            break
                        }
                    }
                    returnArray[i] = randomNumber
                }

            }

            return returnArray
        }

        return intArrayOf(0)
    }

    fun double(minRange: Double, maxRange: Double, totalReturnedValueCount: Int): DoubleArray {

        if (minRange > maxRange || maxRange - minRange <= totalReturnedValueCount){
            println("This is impossible or may crash the app!")
        }
        else{
            val returnArray = DoubleArray(totalReturnedValueCount)

            var randomNumber = 0.0

            for (i in 0..totalReturnedValueCount-1) {

                randomNumber = Random.nextDouble(minRange,maxRange)

                if (i == 0){
                    returnArray[i] = randomNumber
                }
                else{
                    while (true){
                        randomNumber = Random.nextDouble(minRange,maxRange)

                        if (isUnique(returnArray,randomNumber)){
                            break
                        }
                    }
                    returnArray[i] = randomNumber
                }

            }

            return returnArray
        }

        return doubleArrayOf(0.0)
    }

    fun isUnique(intArray: IntArray,numberToCheck : Int) : Boolean{

        for (value in intArray){
            if (value == numberToCheck){
                return false
            }
        }
        return true
    }

    fun isUnique(doubleArray: DoubleArray,numberToCheck : Double) : Boolean{

        for (value in doubleArray){
            if (value == numberToCheck){
                return false
            }
        }
        return true
    }

}