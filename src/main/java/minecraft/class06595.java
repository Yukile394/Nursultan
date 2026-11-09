package minecraft;

public record class06595(int button, int modifiers) implements class06611 {
   public class06595(int button, int modifiers) {
      this.button = button;
      this.modifiers = modifiers;
   }

   public int v() {
      return this.button;
   }

   @Override
   public int y() {
      return this.modifiers;
   }

   @Override
   public int N() {
      return this.button;
   }
}
