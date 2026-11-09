package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import org.jspecify.annotations.Nullable;

public class class00856 extends class01396<class00844> {
   public class00856() {
      super();
   }

   public void N(class04770 var1, Collection<class07049> var2, @Nullable class06584 var3) {
      ArrayList arraylist = Lists.newArrayList();
      HashSet hashset = Sets.newHashSet();

      for (class07049 class07049 : var2) {
         hashset.add(class07049.method_5864());
         arraylist.add(class00821.y(var1, class07049));
      }

      this.N_27(var1, var3x -> var3x.N(arraylist, hashset.size(), var3));
   }

   @Override
   public Codec<class00844> N() {
      return class00844.N;
   }
}
