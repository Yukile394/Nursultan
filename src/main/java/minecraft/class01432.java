package minecraft;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap.Entry;

record class01432(Object2BooleanMap<String> criterions) implements class01385 {
   public static final Codec<class01432> N = class06338.R(Codec.STRING).xmap(class01432::new, class01432::N);

   class01432(Object2BooleanMap<String> criterions) {
      super();
      this.criterions = criterions;
   }

   public Object2BooleanMap<String> N() {
      return this.criterions;
   }

   public boolean test(class08019 var1) {
      ObjectIterator<Entry<String>> objectiterator = this.criterions.object2BooleanEntrySet().iterator();

      while (objectiterator.hasNext()) {
         Entry entry = (Entry)objectiterator.next();
         class06562 class06562 = var1.L((String)entry.getKey());
         if (class06562 == null || class06562.N() != entry.getBooleanValue()) {
            return false;
         }
      }

      return true;
   }
}
