package minecraft;

import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public record class03753(List<List<String>> requirements) {
   public static final Codec<class03753> N = Codec.STRING.listOf().listOf().xmap(class03753::new, class03753::u);
   public static final class03753 y = new class03753(List.of());

   public Set<String> L() {
      ObjectOpenHashSet objectopenhashset = new ObjectOpenHashSet();

      for (List<String> list : this.requirements) {
         objectopenhashset.addAll(list);
      }

      return objectopenhashset;
   }

   public class03753(class00667 var1) {
      this(var1.N_16(var0 -> var0.N_16(class00667::s)));
   }

   public class03753(List<List<String>> requirements) {
      super();
      this.requirements = requirements;
   }

   @Override
   public String toString() {
      return this.requirements.toString();
   }

   public List<List<String>> u() {
      return this.requirements;
   }

   public boolean y() {
      return this.requirements.isEmpty();
   }

   public int y(Predicate<String> var1) {
      int i = 0;
      Iterator<List<String>> iterator = this.requirements.iterator();

      while (iterator.hasNext()) {
         if (N(iterator.next(), var1)) {
            i++;
         }
      }

      return i;
   }

   public static class03753 y(Collection<String> var0) {
      return new class03753(List.of(List.copyOf(var0)));
   }

   public int N() {
      return this.requirements.size();
   }

   public void N(class00667 var1) {
      var1.N_12(this.requirements, (var0, var1x) -> var0.N_12(var1x, class00667::N));
   }

   public static class03753 N(Collection<String> var0) {
      return new class03753(var0.stream().map(List::of).toList());
   }

   public DataResult<class03753> N(Set<String> var1) {
      ObjectOpenHashSet objectopenhashset = new ObjectOpenHashSet();

      for (List<String> list : this.requirements) {
         if (list.isEmpty() && var1.isEmpty()) {
            return DataResult.error(() -> "Requirement entry cannot be empty");
         }

         objectopenhashset.addAll(list);
      }

      if (!var1.equals(objectopenhashset)) {
         SetView setview = Sets.difference(var1, objectopenhashset);
         SetView setview1 = Sets.difference(objectopenhashset, var1);
         return DataResult.error(
            () -> "Advancement completion requirements did not exactly match specified criteria. Missing: " + setview + ". Unknown: " + setview1
         );
      } else {
         return DataResult.success(this);
      }
   }

   private static boolean N(List<String> var0, Predicate<String> var1) {
      for (String s : var0) {
         if (var1.test(s)) {
            return true;
         }
      }

      return false;
   }

   public boolean N(Predicate<String> var1) {
      if (this.requirements.isEmpty()) {
         return false;
      } else {
         Iterator<List<String>> iterator = this.requirements.iterator();

         while (iterator.hasNext()) {
            if (!N(iterator.next(), var1)) {
               return false;
            }
         }

         return true;
      }
   }
}
