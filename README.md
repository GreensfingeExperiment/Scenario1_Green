# 🛒 Product Recommendation System – GreenEsfinge Experiment

The project follows a simple architecture with a service and a test class for validating the recommendation logic.

## 📦 Project Structure

The project follows a simple architecture with a `service` and an `entity`.

## ✅ Description

- `service.RecommendationService`: Contains the business logic to format a recommendation message. The logic includes methods to retrieve a product, its visit count, and a suggestion for another product.

The RecommendationService class can be "greenified" using `GreenFactory`, allowing its behavior to change based on energy-efficiency configurations.
## 🧪 Unit Tests

The test class `RecommendationServiceTest` validates the behavior of the recommendation logic:

- `testFindRecommendation`: Verifies that the original service correctly formats the recommendation message.

- `testFindRecommendationUsingGreenFramework`: Uses `GreenFactory.greenify` to dynamically modify the method’s behavior, demonstrating how the framework can alter execution to promote energy efficiency.