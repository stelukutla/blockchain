package com.blockchain.example;

public class ReddyChain {
  public static void main(String[] args) {
    Block firstBlock = new Block("Hi I am first block", "0");
    System.out.println("Hash for the first block :" + firstBlock.hash);
    Block secondBlock = new Block("Hi I am second Block", firstBlock.hash);
    System.out.println("Hash for the second block :" + secondBlock.hash);
  }
}
