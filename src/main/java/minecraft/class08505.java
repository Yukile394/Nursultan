package minecraft;

import java.util.List;
import java.util.Map.Entry;
import org.joml.Vector3fc;

public record class08505(List<class02081> elements) implements class08534 {
   public class08505(List<class02081> elements) {
      this.elements = elements;
   }

   public List<class02081> N() {
      return this.elements;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static class08496 N(List<class02081> var0, class08838 var1, class02028 var2, class04673 var3, class08512 var4) {
      class08514 class08514 = new class08514();

      for (class02081 class02081 : var0) {
         boolean flag = true;
         boolean flag1 = true;
         boolean flag2 = true;
         Vector3fc vector3fc = class02081.N();
         Vector3fc vector3fc1 = class02081.y();
         if (vector3fc.x() == vector3fc1.x()) {
            flag1 = false;
            flag2 = false;
         }

         if (vector3fc.y() == vector3fc1.y()) {
            flag = false;
            flag2 = false;
         }

         if (vector3fc.z() == vector3fc1.z()) {
            flag = false;
            flag1 = false;
         }

         if (flag || flag1 || flag2) {
            for (Entry entry : class02081.L().entrySet()) {
               class07211 class07211 = (class07211)entry.getKey();
               class02067 class02067 = (class02067)entry.getValue();

               if (switch (class07211.z()) {
                  case field_11048 -> flag;
                  case field_11052 -> flag1;
                  case field_11051 -> flag2;
               }) {
                  class08388 class08388 = var2.y().N(var1, class02067.L(), var4);
                  class02022 class02022 = class04198.N(
                     var2.L(), vector3fc, vector3fc1, class02067, class08388, class07211, var3, class02081.u(), class02081.i(), class02081.R()
                  );
                  if (class02067.N() == null) {
                     class08514.N(class02022);
                  } else {
                     class08514.N(class07211.N(var3.method_3509().L(), class02067.N()), class02022);
                  }
               }
            }
         }
      }

      return class08514.N();
   }

   @Override
   public class08496 bake(class08838 var1, class02028 var2, class04673 var3, class08512 var4) {
      return N(this.elements, var1, var2, var3, var4);
   }
}
