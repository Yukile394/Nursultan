package minecraft;

public record class07378(int containerId, class00329 recipe, boolean useMaxItems) implements class00381<class08051> {
   public static final class02362<class00667, class07378> N = class02362.N(
      class02389.l, class07378::N, class00329.N, class07378::y, class02389.y, class07378::L, class07378::new
   );

   public boolean L() {
      return this.useMaxItems;
   }

   public class07378(int containerId, class00329 recipe, boolean useMaxItems) {
      this.containerId = containerId;
      this.recipe = recipe;
      this.useMaxItems = useMaxItems;
   }

   public class00329 y() {
      return this.recipe;
   }

   public void method_65081(class08051 var1) {
      var1.method_12061(this);
   }

   public int N() {
      return this.containerId;
   }

   @Override
   public class02897<class07378> method_65080() {
      return class04248.yD;
   }
}
