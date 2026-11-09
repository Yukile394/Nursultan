package minecraft;

public record class02353<T>(String name) {
   public class02353(String name) {
      super();
      this.name = name;
   }

   @Override
   public String toString() {
      return "<" + this.name + ">";
   }

   public static <T> class02353<T> N(String var0) {
      return new class02353<>(var0);
   }

   public String N() {
      return this.name;
   }
}
