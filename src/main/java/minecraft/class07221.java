package minecraft;

import com.google.common.collect.Iterators;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public enum class07221 implements Iterable<class07211>, Predicate<class07211> {
   field_11062(
      new class07211[]{class07211.field_11043, class07211.field_11034, class07211.field_11035, class07211.field_11039},
      new class07185[]{class07185.field_11048, class07185.field_11051}
   ),
   field_11064(new class07211[]{class07211.field_11036, class07211.field_11033}, new class07185[]{class07185.field_11052});

   private final class07211[] field_11061;
   private final class07185[] field_11065;

   public List<class07211> L(class06069 var1) {
      return class07536.y(this.field_11061, var1);
   }

   private class07221(class07211[] var3, class07185[] var4) {
      this.field_11061 = var3;
      this.field_11065 = var4;
   }

   @Override
   public Iterator<class07211> iterator() {
      return Iterators.forArray(this.field_11061);
   }

   public int y() {
      return this.field_11061.length;
   }

   public class07185 y(class06069 var1) {
      return class07536.N((class07185[])this.field_11065, var1);
   }

   public boolean test(@Nullable class07211 var1) {
      return var1 != null && var1.z().M() == this;
   }

   public class07211 N(class06069 var1) {
      return class07536.N((class07211[])this.field_11061, var1);
   }

   public Stream<class07211> N() {
      return Arrays.stream(this.field_11061);
   }
}
