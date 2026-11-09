package minecraft;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public enum class00758 {
   field_11069(class07211.field_11043),
   field_11074(class07211.field_11043, class07211.field_11034),
   field_11075(class07211.field_11034),
   field_11070(class07211.field_11035, class07211.field_11034),
   field_11073(class07211.field_11035),
   field_11068(class07211.field_11035, class07211.field_11039),
   field_11072(class07211.field_11039),
   field_11076(class07211.field_11043, class07211.field_11039);

   private final Set<class07211> field_11078;
   private final class00753 field_37995;

   public int L() {
      return this.field_37995.method_10260();
   }

   private class00758(class07211... var3) {
      this.field_11078 = Sets.immutableEnumSet(Arrays.asList(var3));
      this.field_37995 = new class00753(0, 0, 0);

      for (class07211 class07211 : var3) {
         this.field_37995
            .method_20787(this.field_37995.method_10263() + class07211.P())
            .method_10099(this.field_37995.method_10264() + class07211.s())
            .method_20788(this.field_37995.method_10260() + class07211.T());
      }
   }

   public int y() {
      return this.field_37995.method_10263();
   }

   public Set<class07211> N() {
      return this.field_11078;
   }
}
