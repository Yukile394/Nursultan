package minecraft;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import org.jspecify.annotations.Nullable;

public class class00081 implements class04942 {
   public static final class00081 N = new class00081(class00050.field_60226, null);
   @SerializedName("regionSelectionPreference")
   @JsonAdapter(class00045.class)
   public final class00050 y;
   @SerializedName("preferredRegion")
   @JsonAdapter(class00054.class)
   @Nullable
   public class00082 L;

   public class00081(class00050 var1, @Nullable class00082 var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   public class00081 N() {
      return new class00081(this.y, this.L);
   }
}
