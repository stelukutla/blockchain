package com.blockchain.example;

import java.util.Date;

/** Block Example */

public class Block {
  public String hash;
  public String previousHash;
  private String data; // our data will be a simple message.
  private long timeStamp; // as number of milliseconds since 1/1/1970.

  public Block(String data, String previousHash) {
    this.data = data;
    this.previousHash = previousHash;
    this.timeStamp = new Date().getTime();
    this.hash = calculateSha256();
  }


    /**
     * Calcuate the hash using Sha256 algorithm
     * @return
     */
  public String calculateSha256() {
    String calculatedHash = StringUtils.applySha256(previousHash + Long.toString(timeStamp) + data);
    return calculatedHash;
  }
}
