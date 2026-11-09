package minecraft;

import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record class00323(Duration duration, class07321 chunkPos, String structureName, String level, boolean success) implements class03230 {
   public String L() {
      return this.structureName;
   }

   public class00323(Duration duration, class07321 chunkPos, String structureName, String level, boolean success) {
      super();
      this.duration = duration;
      this.chunkPos = chunkPos;
      this.structureName = structureName;
      this.level = level;
      this.success = success;
   }

   public boolean i() {
      return this.success;
   }

   public String u() {
      return this.level;
   }

   public class07321 y() {
      return this.chunkPos;
   }

   public static class00323 N(RecordedEvent var0) {
      return new class00323(
         var0.getDuration(),
         new class07321(var0.getInt("chunkPosX"), var0.getInt("chunkPosX")),
         var0.getString("structure"),
         var0.getString("level"),
         var0.getBoolean("success")
      );
   }

   @Override
   public Duration N() {
      return this.duration;
   }
}
