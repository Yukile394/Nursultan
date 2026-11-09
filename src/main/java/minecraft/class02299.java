package minecraft;

import jdk.jfr.consumer.RecordedEvent;

public record class02299(String level, String dimension, int x, int z) {
   public int L() {
      return this.x;
   }

   public class02299(String level, String dimension, int x, int z) {
      this.level = level;
      this.dimension = dimension;
      this.x = x;
      this.z = z;
   }

   public int u() {
      return this.z;
   }

   public String y() {
      return this.dimension;
   }

   public static class02299 N(RecordedEvent var0) {
      return new class02299(var0.getString("level"), var0.getString("dimension"), var0.getInt("chunkPosX"), var0.getInt("chunkPosZ"));
   }

   public String N() {
      return this.level;
   }
}
