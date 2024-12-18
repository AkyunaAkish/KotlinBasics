package com.example.kotlinbasics

class OffspringInheritanceClass : ChildInheritanceClass(), Archery, Singer {
    override fun archery() {
        super.archery()

        println("Offspring archery skills enhanced")
    }

    override fun sing() {
        super.sing()

        println("Improved offspring singing skills")
    }
}