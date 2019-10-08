package seedu.address.transaction.commands;

import seedu.address.transaction.model.Model;
import seedu.address.transaction.model.Transaction;
import seedu.address.transaction.model.exception.NoSuchIndexException;
import seedu.address.transaction.ui.TransactionMessages;

/**
 * Deletes a transaction to the transaction list.
 */
public class DeleteCommand extends Command {
    private int index;
    public static final String COMMAND_WORD = "delete";

    /**
     * Creates an DeleteCommand to delete the specified {@code Transaction}
     */
    public DeleteCommand(int index) {
        this.index = index;
    }

    @Override
    public CommandResult execute(Model model, seedu.address.person.model.Model personModel)
            throws NoSuchIndexException {
        TransactionMessages transactionMessages = new TransactionMessages();
        Transaction transaction = model.findTransactionByIndex(index);
        model.deleteTransaction(index);
        return new CommandResult(transactionMessages.deletedTransaction(transaction));
    }
}
