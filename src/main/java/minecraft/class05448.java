package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class class05448 {
   private final List<class03556<class07829<?>>> N = new ArrayList<>();
   private final List<List<class03556<class04336>>> y = new ArrayList<>();

   public class05448() {
      super();
   }

   public class05448 N(class03556<class07829<?>> var1) {
      this.N.add(var1);
      return this;
   }

   private void N(int var1) {
      while (this.y.size() <= var1) {
         this.y.add(Lists.newArrayList());
      }
   }

   public class01029 N() {
      return new class01029(class03543.N(this.N), this.y.stream().map(class03543::N).collect(ImmutableList.toImmutableList()));
   }

   public class05448 N(int var1, class03556<class04336> var2) {
      this.N(var1);
      this.y.get(var1).add(var2);
      return this;
   }

   public class05448 N(class07852 var1, class03556<class04336> var2) {
      return this.N(var1.ordinal(), var2);
   }
}
