package service;

import entity.Operation;
import storage.InFileOperationStorage;
import storage.InMemoryOperationStorage;
import storage.OperationStorage;

import java.util.List;

/**
 * @author Simon Pirko on 17.01.23
 */
public class CalculatorService {

    private final InFileOperationStorage fileStorage = new InFileOperationStorage();
    private final OperationStorage memoryStorage = new InMemoryOperationStorage();

    public Operation calculate(Operation operation) {
        String stringtype = operation.getType().toUpperCase();

        Type type = Type.valueOf(stringtype);


        switch (type) {

            case SUM:
                operation.setResult(sum(operation.getNum1(), operation.getNum2()));
                fileStorage.save(operation);
                memoryStorage.save(operation);
                return operation;
            case SUB:
                operation.setResult(sub(operation.getNum1(), operation.getNum2()));
                fileStorage.save(operation);
                memoryStorage.save(operation);
                return operation;
            case MULT:
                operation.setResult(mult(operation.getNum1(), operation.getNum2()));
                fileStorage.save(operation);
                memoryStorage.save(operation);
                return operation;
            case DIV:
                operation.setResult(div(operation.getNum1(), operation.getNum2()));
                fileStorage.save(operation);
                memoryStorage.save(operation);
                return operation;


        }
        return null;
    }

    private static double sum(double a, double b) {
        return a + b;
    }

    private static double sub(double a, double b) {
        return a - b;
    }

    private static double mult(double a, double b) {
        return a * b;
    }

    private static double div(double a, double b) {
        return a / b;
    }

    public List<Operation> showHistory() {
        return memoryStorage.findAll();
    }

    enum Type {
        SUM,
        SUB,
        MULT,
        DIV
    }
}

//	public List<Operation> findAllByUser(User user) {
//		List<Operation> allByUserId = storage.getAllByUserId(user.getId());
//		return allByUserId;
//	}


