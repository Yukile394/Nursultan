package minecraft;

import java.util.Collection;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

record class01088(String name, class01622 resources, Predicate<class01894> filter) {

   @Nullable
   public Predicate<class01894> L() {
      return this.filter;
   }

   class01088(String name, @Nullable class01622 resources, @Nullable Predicate<class01894> filter) {
      this.name = name;
      this.resources = resources;
      this.filter = filter;
   }

   @Nullable
   public class01622 y() {
      return this.resources;
   }

   public boolean N(class01894 var1) {
      return this.filter != null && this.filter.test(var1);
   }

   public void N(Collection<class01894> var1) {
      if (this.filter != null) {
         var1.removeIf(this.filter);
      }
   }

   public String N() {
      return this.name;
   }
}
