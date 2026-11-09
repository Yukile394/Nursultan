package minecraft;

public record class06601(int key, int scancode, int modifiers) implements class06611 {
   public class06601(int key, int scancode, int modifiers) {
      super();
      this.key = key;
      this.scancode = scancode;
      this.modifiers = modifiers;
   }

   public int n() {
      return this.scancode;
   }

   public int v() {
      return this.key;
   }

   @Override
   public int y() {
      return this.modifiers;
   }

   @Override
   public int N() {
      return this.key;
   }
}
