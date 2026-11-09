package minecraft;

import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record class03201(Duration duration, class07321 chunkPos, class00893 worldPos, class00549 status, String level) implements class03230 {
   public class00893 L() {
      return this.worldPos;
   }

   public class03201(Duration duration, class07321 chunkPos, class00893 worldPos, class00549 status, String level) {
      this.duration = duration;
      this.chunkPos = chunkPos;
      this.worldPos = worldPos;
      this.status = status;
      this.level = level;
   }

   public String i() {
      return this.level;
   }

   public class00549 u() {
      return this.status;
   }

   public class07321 y() {
      return this.chunkPos;
   }

   public static class03201 N(RecordedEvent var0) {
      return new class03201(
         var0.getDuration(),
         new class07321(var0.getInt("chunkPosX"), var0.getInt("chunkPosX")),
         new class00893(var0.getInt("worldPosX"), var0.getInt("worldPosZ")),
         class00549.N(var0.getString("status")),
         var0.getString("level")
      );
   }

   @Override
   public Duration N() {
      return this.duration;
   }
}
