import java.util.Map;
import com.google.gson.annotations.SerializedName;

public class RespostaApi {

  @SerializedName("conversion_rates")
  private Map<String, Double> conversionRates;


  public Map<String, Double> getConversionRates() {
    return conversionRates;
  }

  public void setConversionRates(Map<String, Double> conversionRates) {
    this.conversionRates = conversionRates;
  }
}
