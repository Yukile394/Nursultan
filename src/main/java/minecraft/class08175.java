package minecraft;

import jdk.jfr.consumer.RecordedEvent;

public record class08175(int fps) {
   public class08175(int fps) {
      this.fps = fps;
   }

   public static class08175 N(RecordedEvent var0, String var1) {
      return new class08175(var0.getInt(var1));
   }

   public int N() {
      return this.fps;
   }
}
