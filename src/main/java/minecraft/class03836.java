package minecraft;

public record class03836(class06889 position, class06889 forward, class06889 up) {
   public static final class03836 N = new class03836(class06889.L, new class06889(0.0, 0.0, -1.0), new class06889(0.0, 1.0, 0.0));

   public class06889 L() {
      return this.forward;
   }

   public class03836(class06889 position, class06889 forward, class06889 up) {
      super();
      this.position = position;
      this.forward = forward;
      this.up = up;
   }

   public class06889 u() {
      return this.up;
   }

   public class06889 y() {
      return this.position;
   }

   public class06889 N() {
      return this.forward.L(this.up);
   }
}
