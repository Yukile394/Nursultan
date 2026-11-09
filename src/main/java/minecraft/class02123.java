package minecraft;

public record class02123(class01295 component, class02106 childPath) implements class02106 {
   public class02106 L() {
      return this.childPath;
   }

   public class02123(class01295 component, class02106 childPath) {
      super();
      this.component = component;
      this.childPath = childPath;
   }

   public class01295 N() {
      return this.component;
   }

   @Override
   public void N(boolean var1) {
      if (!var1) {
         this.component.method_25395(null);
      } else {
         this.component.method_25395(this.childPath.N());
      }

      this.childPath.N(var1);
   }
}
