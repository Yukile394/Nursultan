package minecraft;

import jdk.jfr.consumer.RecordedEvent;

public record class04335(String direction, String protocolId, String packetId) {
   public String L() {
      return this.packetId;
   }

   public class04335(String direction, String protocolId, String packetId) {
      super();
      this.direction = direction;
      this.protocolId = protocolId;
      this.packetId = packetId;
   }

   public String y() {
      return this.protocolId;
   }

   public String N() {
      return this.direction;
   }

   public static class04335 N(RecordedEvent var0) {
      return new class04335(var0.getString("packetDirection"), var0.getString("protocolId"), var0.getString("packetId"));
   }
}
