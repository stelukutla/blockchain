package com.blockchain.example;

/** Build the chain */
public class ReddyChain {
  public static void main(String[] args) {
    Block firstBlock = new Block("Hi I am first block", "0");
    System.out.println("Hash for the first block :" + firstBlock.hash);
    Block secondBlock = new Block("Hi I am second Block", firstBlock.hash);
    System.out.println("Hash for the second block :" + secondBlock.hash);

    // Create 100 blocks
    String previousHash = secondBlock.hash;
    for (int i = 0; i < 100; i++) {
      Block dynamicBlock = new Block(" Block :" + i, previousHash);
      System.out.println("Hash for the block : " + i + " ->" + dynamicBlock.hash);
      previousHash = dynamicBlock.hash;
    }
  }
}
