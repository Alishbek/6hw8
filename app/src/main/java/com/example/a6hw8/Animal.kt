package com.example.a6hw8

//1:Single Responsibility Principle
//Суперкласс
open class Animal() {

    open fun makeVoice(): String {
        return ""
    }

    open fun legCount(): Int {
        return 0
    }

    open fun getAnimalColor(): String {
        return ""
    }
}

class AnimalDB() {
    fun saveAnimal(animal: Animal) {

    }

    fun getAnimal(): Animal {
        return Animal()
    }
}

//Подклассы
class Lion() : Animal() {
    override fun makeVoice(): String {
        return "Roar"
    }

    override fun legCount(): Int {
        return 4
    }

    override fun getAnimalColor(): String {
        return "Yellow"
    }
}

class Mouse() : Animal() {
    override fun makeVoice(): String {
        return "Squeak"
    }

    override fun legCount(): Int {
        return 4
    }

    override fun getAnimalColor(): String {
        return "Grey"
    }
}

class Horse() : Animal() {
    override fun makeVoice(): String {
        return "Iuuuuu"
    }

    override fun legCount(): Int {
        return 4
    }

    override fun getAnimalColor(): String {
        return "Brown"
    }
}

class Snake() : Animal() {
    override fun makeVoice(): String {
        return "Ssssss"
    }

    override fun legCount(): Int {
        return 0
    }

    override fun getAnimalColor(): String {
        return "Green"
    }

}

class Dog() : Animal() {
    override fun makeVoice(): String {
        return "Woof"
    }

    override fun legCount(): Int {
        return 4
    }

    override fun getAnimalColor(): String {
        return "Black"
    }
}class Cow() : Animal() {
    override fun makeVoice(): String {
        return "Moo"
    }

    override fun legCount(): Int {
        return 4
    }

    override fun getAnimalColor(): String {
        return "White"
    }
}