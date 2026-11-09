package minecraft;

public record class06588<T extends class06516>(T trigger, class03711 advancement, String criterion) {
   public String L() {
      return this.criterion;
   }

   public class06588(T trigger, class03711 advancement, String criterion) {
      this.trigger = (T)trigger;
      this.advancement = advancement;
      this.criterion = criterion;
   }

   public class03711 y() {
      return this.advancement;
   }

   public T N() {
      return this.trigger;
   }

   public void N(class03704 var1) {
      var1.N(this.advancement, this.criterion);
   }
}
