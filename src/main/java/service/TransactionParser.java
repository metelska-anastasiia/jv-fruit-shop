package service;

import java.util.List;
import model.FruitTransaction;

public interface TransactionParser {
    public List<FruitTransaction> parse(List<String> transactions);
}
