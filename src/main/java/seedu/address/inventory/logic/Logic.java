package seedu.address.inventory.logic;

import seedu.address.inventory.commands.CommandResult;
import seedu.address.transaction.util.TransactionList;

public interface Logic {

    CommandResult execute(String commandText) throws Exception;

<<<<<<< HEAD
    TransactionList getInventoryList() throws Exception;
=======
    TransactionList getTransactionList() throws Exception;
>>>>>>> Implemented some Inventory classes
}
