package minecraft;

public record class07303(class07209 pos, class00891 block, int paramA, int paramB) {
   public int L() {
      return this.paramA;
   }

   public class07303(class07209 pos, class00891 block, int paramA, int paramB) {
      super();
      this.pos = pos;
      this.block = block;
      this.paramA = paramA;
      this.paramB = paramB;
   }

   public int u() {
      return this.paramB;
   }

   public class00891 y() {
      return this.block;
   }

   public class07209 N() {
      return this.pos;
   }
}
