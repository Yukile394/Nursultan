package minecraft;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;

public class class09023 {
   final Map<class01894, class00137> N = Maps.newHashMap();
   private Map<class01894, class01079> y = Map.of();

   protected class09023() {
      super();
   }

   public void N(Map<class01894, class00137> var1, Map<class01894, class01079> var2, class09038 var3) {
      var1.clear();
      var2.clear();
      var2.putAll(this.y);

      for (Entry entry : this.N.entrySet()) {
         var1.put((class01894)entry.getKey(), (class00137)entry.getValue());
         ((class00137)entry.getValue()).N(var3);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   void N(class01894 var1, class00012 var2) {
      class00137 class00137 = this.N.get(var1);
      boolean flag = class00137 == null;
      if (flag || var2.y()) {
         if (!flag) {
            class09033.R.debug("Replaced sound event location {}", var1);
         }

         class00137 = new class00137(var1, var2.L());
         this.N.put(var1, class00137);
      }

      class02857 class02857 = class02857.N(this.y);

      for (class00002 class00002 : var2.N()) {
         class01894 class01894 = class00002.N();
         Object object;
         switch (class00002.R()) {
            case field_5474:
               if (!class09033.N(class00002, var1, class02857)) {
                  continue;
               }

               object = class00002;
               break;
            case field_5473:
               object = new class08996(this, class01894, class00002);
               break;
            default:
               throw new IllegalStateException("Unknown SoundEventRegistration type: " + class00002.R());
         }

         class00137.N((class00124<class00002>)object);
      }
   }

   void N(class01089 var1) {
      this.y = class00002.N.N(var1);
   }
}
