package minecraft;

import Nursultan.class09108;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;

class class04986 implements ExclusionStrategy {
   class04986(class04968 var1) {
      super();
   }

   public boolean shouldSkipClass(Class<?> var1) {
      return false;
   }

   public boolean shouldSkipField(FieldAttributes var1) {
      return var1.getAnnotation(class09108.class) != null;
   }
}
