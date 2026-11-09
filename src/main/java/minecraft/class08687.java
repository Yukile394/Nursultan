package minecraft;

public record class08687(boolean forward, boolean backward, boolean left, boolean right, boolean jump, boolean shift, boolean sprint) {
   private static final byte z = 1;
   private static final byte U = 2;
   private static final byte E = 4;
   private static final byte W = 8;
   private static final byte m = 16;
   private static final byte P = 32;
   private static final byte s = 64;
   public static final class02362<class00667, class08687> N = new class08709();
   public static class08687 y = new class08687(false, false, false, false, false, false, false);

   public boolean L() {
      return this.left;
   }

   public boolean M() {
      return this.sprint;
   }

   public class08687(boolean forward, boolean backward, boolean left, boolean right, boolean jump, boolean shift, boolean sprint) {
      super();
      this.forward = forward;
      this.backward = backward;
      this.left = left;
      this.right = right;
      this.jump = jump;
      this.shift = shift;
      this.sprint = sprint;
   }

   public boolean i() {
      return this.jump;
   }

   public boolean u() {
      return this.right;
   }

   public boolean y() {
      return this.backward;
   }

   public boolean N() {
      return this.forward;
   }

   public boolean R() {
      return this.shift;
   }
}
