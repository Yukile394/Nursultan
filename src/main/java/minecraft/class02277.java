package minecraft;

public record class02277(String level, class05946<class07299> dimension, String type) {
   public String L() {
      return this.type;
   }

   public class02277(String level, class05946<class07299> dimension, String type) {
      this.level = level;
      this.dimension = dimension;
      this.type = type;
   }

   public class05946<class07299> y() {
      return this.dimension;
   }

   public String N() {
      return this.level;
   }

   public class02277 N(String var1) {
      return new class02277(this.level, this.dimension, this.type + var1);
   }
}
