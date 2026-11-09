package minecraft;

public record class05601(class07049 entity, class07664 anchor) implements class05617 {
   public class05601(class07049 entity, class07664 anchor) {
      this.entity = entity;
      this.anchor = anchor;
   }

   public class07664 y() {
      return this.anchor;
   }

   public class07049 N() {
      return this.entity;
   }

   @Override
   public void N(class07701 var1, class07049 var2) {
      if (var2 instanceof class04770) {
         ((class04770)var2).method_14222(var1.m(), this.entity, this.anchor);
      } else {
         var2.method_5702(var1.m(), this.anchor.N(this.entity));
      }
   }
}
