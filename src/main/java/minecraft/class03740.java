package minecraft;

import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.authlib.minecraft.report.ReportedEntity;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;

public class class03740 extends class02073<class03732> {
   @Nullable
   @Override
   public class02043 L() {
      return this.N.i.length() > this.y.maxOpinionCommentsLength() ? class02043.u : super.L();
   }

   public class03740(UUID var1, String var2, AbuseReportLimits var3) {
      super(new class03732(UUID.randomUUID(), Instant.now(), var1, var2), var3);
   }

   public class03740(class03732 var1, AbuseReportLimits var2) {
      super(var1, var2);
   }

   @Override
   public boolean y() {
      return StringUtils.isNotEmpty(this.M());
   }

   @Override
   public Either<class02044, class02043> N(class03409 var1) {
      class02043 class02043 = this.L();
      if (class02043 != null) {
         return Either.right(class02043);
      } else {
         ReportedEntity reportedentity = new ReportedEntity(this.N.u);
         AbuseReport abusereport = AbuseReport.name(this.N.i, reportedentity, this.N.L);
         return Either.left(new class02044(this.N.y, class03752.field_46066, abusereport));
      }
   }
}
