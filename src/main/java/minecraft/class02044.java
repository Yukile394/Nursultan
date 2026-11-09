package minecraft;

import com.mojang.authlib.minecraft.report.AbuseReport;
import java.util.UUID;

public record class02044(UUID id, class03752 reportType, AbuseReport report) {
   public AbuseReport L() {
      return this.report;
   }

   public class02044(UUID id, class03752 reportType, AbuseReport report) {
      this.id = id;
      this.reportType = reportType;
      this.report = report;
   }

   public class03752 y() {
      return this.reportType;
   }

   public UUID N() {
      return this.id;
   }
}
