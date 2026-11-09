package minecraft;

public record class06626(int codepoint, int modifiers) {
   public int L() {
      return this.codepoint;
   }

   public class06626(int codepoint, int modifiers) {
      super();
      this.codepoint = codepoint;
      this.modifiers = modifiers;
   }

   public int u() {
      return this.modifiers;
   }

   public boolean y() {
      return class05018.N(this.codepoint);
   }

   public String N() {
      return Character.toString(this.codepoint);
   }
}
