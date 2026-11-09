package minecraft;

import com.mojang.authlib.GameProfile;

public record class03713(GameProfile gameProfile, int latency, class03737 clientInformation, boolean transferred) {
   public class03737 L() {
      return this.clientInformation;
   }

   public class03713(GameProfile gameProfile, int latency, class03737 clientInformation, boolean transferred) {
      this.gameProfile = gameProfile;
      this.latency = latency;
      this.clientInformation = clientInformation;
      this.transferred = transferred;
   }

   public boolean u() {
      return this.transferred;
   }

   public int y() {
      return this.latency;
   }

   public static class03713 N(GameProfile var0, boolean var1) {
      return new class03713(var0, 0, class03737.N(), var1);
   }

   public GameProfile N() {
      return this.gameProfile;
   }
}
