package minecraft;

import java.util.List;

record class08281(Object equalityGroup, List<Object> coloringValues) {
   private class08281(Object equalityGroup, List<Object> coloringValues) {
      super();
      this.equalityGroup = equalityGroup;
      this.coloringValues = coloringValues;
   }

   public List<Object> y() {
      return this.coloringValues;
   }

   private static List<Object> N(class00500 var0, List<class08092<?>> var1) {
      Object[] aobject = new Object[var1.size()];

      for (int i = 0; i < var1.size(); i++) {
         aobject[i] = var0.L((class08092)var1.get(i));
      }

      return List.of(aobject);
   }

   public Object N() {
      return this.equalityGroup;
   }

   public static class08281 N(class00500 var0, class08889 var1, List<class08092<?>> var2) {
      List<Object> list = N(var0, var2);
      Object object = var1.method_62332(var0);
      return new class08281(object, list);
   }
}
