package minecraft;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jspecify.annotations.Nullable;

public record class00080(class00070 options, List<class00064> settings, class00081 regionSelectionPreference, class04951 description) implements class04942 {
   @SerializedName("regionSelectionPreference")
   @Nullable
   public class00081 L() {
      return this.regionSelectionPreference;
   }

   public class00080(class00070 options, List<class00064> settings, @Nullable class00081 regionSelectionPreference, @Nullable class04951 description) {
      this.options = options;
      this.settings = settings;
      this.regionSelectionPreference = regionSelectionPreference;
      this.description = description;
   }

   @SerializedName("description")
   @Nullable
   public class04951 u() {
      return this.description;
   }

   @SerializedName("settings")
   public List<class00064> y() {
      return this.settings;
   }

   @SerializedName("options")
   public class00070 N() {
      return this.options;
   }
}
