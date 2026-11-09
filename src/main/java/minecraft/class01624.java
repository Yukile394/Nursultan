package minecraft;

public record class01624(long timeout, int flags) {
   public static final long N = 0L;
   public static final int y = 1;
   public static final int L = 2;
   public static final int u = 4;
   public static final int i = 8;
   public static final int R = 16;
   public static final class01624 M = N("player_spawn", 20L, 2);
   public static final class01624 B = N("spawn_search", 1L, 2);
   public static final class01624 Z = N("dragon", 0L, 6);
   public static final class01624 z = N("player_loading", 0L, 2);
   public static final class01624 U = N("player_simulation", 0L, 12);
   public static final class01624 E = N("forced", 0L, 15);
   public static final class01624 W = N("portal", 300L, 15);
   public static final class01624 m = N("ender_pearl", 40L, 14);
   public static final class01624 P = N("unknown", 1L, 18);

   public boolean L() {
      return (this.flags & 4) != 0;
   }

   public long M() {
      return this.timeout;
   }

   public class01624(long timeout, int flags) {
      this.timeout = timeout;
      this.flags = flags;
   }

   public int B() {
      return this.flags;
   }

   public boolean i() {
      return (this.flags & 16) != 0;
   }

   public boolean u() {
      return (this.flags & 8) != 0;
   }

   public boolean y() {
      return (this.flags & 2) != 0;
   }

   public boolean N() {
      return (this.flags & 1) != 0;
   }

   private static class01624 N(String var0, long var1, int var3) {
      return class00751.N(class04206.NY, var0, new class01624(var1, var3));
   }

   public boolean R() {
      return this.timeout != 0L;
   }
}
