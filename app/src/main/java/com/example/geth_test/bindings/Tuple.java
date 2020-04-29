package com.example.geth_test.bindings;


// This file is an automatically generated Java binding. Do not modify as any
// change will likely be lost upon the next re-generation!

import org.ethereum.geth.*;
import java.util.*;



public class Tuple {
	// ABI is the input ABI used to generate the binding from.
	public final static String ABI = "[{\"anonymous\":false,\"inputs\":[{\"components\":[{\"internalType\":\"uint256\",\"name\":\"a\",\"type\":\"uint256\"},{\"internalType\":\"uint256[]\",\"name\":\"b\",\"type\":\"uint256[]\"},{\"components\":[{\"internalType\":\"uint256\",\"name\":\"x\",\"type\":\"uint256\"},{\"internalType\":\"uint256\",\"name\":\"y\",\"type\":\"uint256\"}],\"internalType\":\"structTuple.T[]\",\"name\":\"c\",\"type\":\"tuple[]\"}],\"indexed\":false,\"internalType\":\"structTuple.S\",\"name\":\"a\",\"type\":\"tuple\"},{\"components\":[{\"internalType\":\"uint256\",\"name\":\"x\",\"type\":\"uint256\"},{\"internalType\":\"uint256\",\"name\":\"y\",\"type\":\"uint256\"}],\"indexed\":false,\"internalType\":\"structTuple.T[2][]\",\"name\":\"b\",\"type\":\"tuple[2][]\"},{\"components\":[{\"internalType\":\"uint256\",\"name\":\"x\",\"type\":\"uint256\"},{\"internalType\":\"uint256\",\"name\":\"y\",\"type\":\"uint256\"}],\"indexed\":false,\"internalType\":\"structTuple.T[][2]\",\"name\":\"c\",\"type\":\"tuple[][2]\"},{\"components\":[{\"internalType\":\"uint256\",\"name\":\"a\",\"type\":\"uint256\"},{\"internalType\":\"uint256[]\",\"name\":\"b\",\"type\":\"uint256[]\"},{\"components\":[{\"internalType\":\"uint256\",\"name\":\"x\",\"type\":\"uint256\"},{\"internalType\":\"uint256\",\"name\":\"y\",\"type\":\"uint256\"}],\"internalType\":\"structTuple.T[]\",\"name\":\"c\",\"type\":\"tuple[]\"}],\"indexed\":false,\"internalType\":\"structTuple.S[]\",\"name\":\"d\",\"type\":\"tuple[]\"},{\"indexed\":false,\"internalType\":\"uint256[]\",\"name\":\"e\",\"type\":\"uint256[]\"}],\"name\":\"TupleEvent\",\"type\":\"event\"},{\"anonymous\":false,\"inputs\":[{\"components\":[{\"internalType\":\"uint8\",\"name\":\"x\",\"type\":\"uint8\"},{\"internalType\":\"uint8\",\"name\":\"y\",\"type\":\"uint8\"}],\"indexed\":false,\"internalType\":\"structTuple.P[]\",\"name\":\"\",\"type\":\"tuple[]\"}],\"name\":\"TupleEvent2\",\"type\":\"event\"},{\"constant\":true,\"inputs\":[{\"components\":[{\"internalType\":\"uint256\",\"name\":\"a\",\"type\":\"uint256\"},{\"internalType\":\"uint256[]\",\"name\":\"b\",\"type\":\"uint256[]\"},{\"components\":[{\"internalType\":\"uint256\",\"name\":\"x\",\"type\":\"uint256\"},{\"internalType\":\"uint256\",\"name\":\"y\",\"type\":\"uint256\"}],\"internalType\":\"structTuple.T[]\",\"name\":\"c\",\"type\":\"tuple[]\"}],\"internalType\":\"structTuple.S\",\"name\":\"a\",\"type\":\"tuple\"},{\"components\":[{\"internalType\":\"uint256\",\"name\":\"x\",\"type\":\"uint256\"},{\"internalType\":\"uint256\",\"name\":\"y\",\"type\":\"uint256\"}],\"internalType\":\"structTuple.T[2][]\",\"name\":\"b\",\"type\":\"tuple[2][]\"},{\"components\":[{\"internalType\":\"uint256\",\"name\":\"x\",\"type\":\"uint256\"},{\"internalType\":\"uint256\",\"name\":\"y\",\"type\":\"uint256\"}],\"internalType\":\"structTuple.T[][2]\",\"name\":\"c\",\"type\":\"tuple[][2]\"},{\"components\":[{\"internalType\":\"uint256\",\"name\":\"a\",\"type\":\"uint256\"},{\"internalType\":\"uint256[]\",\"name\":\"b\",\"type\":\"uint256[]\"},{\"components\":[{\"internalType\":\"uint256\",\"name\":\"x\",\"type\":\"uint256\"},{\"internalType\":\"uint256\",\"name\":\"y\",\"type\":\"uint256\"}],\"internalType\":\"structTuple.T[]\",\"name\":\"c\",\"type\":\"tuple[]\"}],\"internalType\":\"structTuple.S[]\",\"name\":\"d\",\"type\":\"tuple[]\"},{\"internalType\":\"uint256[]\",\"name\":\"e\",\"type\":\"uint256[]\"}],\"name\":\"func1\",\"outputs\":[{\"components\":[{\"internalType\":\"uint256\",\"name\":\"a\",\"type\":\"uint256\"},{\"internalType\":\"uint256[]\",\"name\":\"b\",\"type\":\"uint256[]\"},{\"components\":[{\"internalType\":\"uint256\",\"name\":\"x\",\"type\":\"uint256\"},{\"internalType\":\"uint256\",\"name\":\"y\",\"type\":\"uint256\"}],\"internalType\":\"structTuple.T[]\",\"name\":\"c\",\"type\":\"tuple[]\"}],\"internalType\":\"structTuple.S\",\"name\":\"\",\"type\":\"tuple\"},{\"components\":[{\"internalType\":\"uint256\",\"name\":\"x\",\"type\":\"uint256\"},{\"internalType\":\"uint256\",\"name\":\"y\",\"type\":\"uint256\"}],\"internalType\":\"structTuple.T[2][]\",\"name\":\"\",\"type\":\"tuple[2][]\"},{\"components\":[{\"internalType\":\"uint256\",\"name\":\"x\",\"type\":\"uint256\"},{\"internalType\":\"uint256\",\"name\":\"y\",\"type\":\"uint256\"}],\"internalType\":\"structTuple.T[][2]\",\"name\":\"\",\"type\":\"tuple[][2]\"},{\"components\":[{\"internalType\":\"uint256\",\"name\":\"a\",\"type\":\"uint256\"},{\"internalType\":\"uint256[]\",\"name\":\"b\",\"type\":\"uint256[]\"},{\"components\":[{\"internalType\":\"uint256\",\"name\":\"x\",\"type\":\"uint256\"},{\"internalType\":\"uint256\",\"name\":\"y\",\"type\":\"uint256\"}],\"internalType\":\"structTuple.T[]\",\"name\":\"c\",\"type\":\"tuple[]\"}],\"internalType\":\"structTuple.S[]\",\"name\":\"\",\"type\":\"tuple[]\"},{\"internalType\":\"uint256[]\",\"name\":\"\",\"type\":\"uint256[]\"}],\"payable\":false,\"stateMutability\":\"pure\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"components\":[{\"internalType\":\"uint256\",\"name\":\"a\",\"type\":\"uint256\"},{\"internalType\":\"uint256[]\",\"name\":\"b\",\"type\":\"uint256[]\"},{\"components\":[{\"internalType\":\"uint256\",\"name\":\"x\",\"type\":\"uint256\"},{\"internalType\":\"uint256\",\"name\":\"y\",\"type\":\"uint256\"}],\"internalType\":\"structTuple.T[]\",\"name\":\"c\",\"type\":\"tuple[]\"}],\"internalType\":\"structTuple.S\",\"name\":\"a\",\"type\":\"tuple\"},{\"components\":[{\"internalType\":\"uint256\",\"name\":\"x\",\"type\":\"uint256\"},{\"internalType\":\"uint256\",\"name\":\"y\",\"type\":\"uint256\"}],\"internalType\":\"structTuple.T[2][]\",\"name\":\"b\",\"type\":\"tuple[2][]\"},{\"components\":[{\"internalType\":\"uint256\",\"name\":\"x\",\"type\":\"uint256\"},{\"internalType\":\"uint256\",\"name\":\"y\",\"type\":\"uint256\"}],\"internalType\":\"structTuple.T[][2]\",\"name\":\"c\",\"type\":\"tuple[][2]\"},{\"components\":[{\"internalType\":\"uint256\",\"name\":\"a\",\"type\":\"uint256\"},{\"internalType\":\"uint256[]\",\"name\":\"b\",\"type\":\"uint256[]\"},{\"components\":[{\"internalType\":\"uint256\",\"name\":\"x\",\"type\":\"uint256\"},{\"internalType\":\"uint256\",\"name\":\"y\",\"type\":\"uint256\"}],\"internalType\":\"structTuple.T[]\",\"name\":\"c\",\"type\":\"tuple[]\"}],\"internalType\":\"structTuple.S[]\",\"name\":\"d\",\"type\":\"tuple[]\"},{\"internalType\":\"uint256[]\",\"name\":\"e\",\"type\":\"uint256[]\"}],\"name\":\"func2\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[{\"components\":[{\"internalType\":\"uint16\",\"name\":\"x\",\"type\":\"uint16\"},{\"internalType\":\"uint16\",\"name\":\"y\",\"type\":\"uint16\"}],\"internalType\":\"structTuple.Q[]\",\"name\":\"\",\"type\":\"tuple[]\"}],\"name\":\"func3\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"pure\",\"type\":\"function\"}]";


	// BYTECODE is the compiled bytecode used for deploying new contracts.
	public final static String BYTECODE = "0x60806040523480156100115760006000fd5b50610017565b6110b2806100266000396000f3fe60806040523480156100115760006000fd5b50600436106100465760003560e01c8063443c79b41461004c578063d0062cdd14610080578063e4d9a43b1461009c57610046565b60006000fd5b610066600480360361006191908101906107b8565b6100b8565b604051610077959493929190610ccb565b60405180910390f35b61009a600480360361009591908101906107b8565b6100ef565b005b6100b660048036036100b19190810190610775565b610136565b005b6100c061013a565b60606100ca61015e565b606060608989898989945094509450945094506100e2565b9550955095509550959050565b7f18d6e66efa53739ca6d13626f35ebc700b31cced3eddb50c70bbe9c082c6cd008585858585604051610126959493929190610ccb565b60405180910390a15b5050505050565b5b50565b60405180606001604052806000815260200160608152602001606081526020015090565b60405180604001604052806002905b606081526020019060019003908161016d57905050905661106e565b600082601f830112151561019d5760006000fd5b81356101b06101ab82610d6f565b610d41565b915081818352602084019350602081019050838560808402820111156101d65760006000fd5b60005b8381101561020757816101ec888261037a565b8452602084019350608083019250505b6001810190506101d9565b5050505092915050565b600082601f83011215156102255760006000fd5b600261023861023382610d98565b610d41565b9150818360005b83811015610270578135860161025588826103f3565b8452602084019350602083019250505b60018101905061023f565b5050505092915050565b600082601f830112151561028e5760006000fd5b81356102a161029c82610dbb565b610d41565b915081818352602084019350602081019050838560408402820111156102c75760006000fd5b60005b838110156102f857816102dd888261058b565b8452602084019350604083019250505b6001810190506102ca565b5050505092915050565b600082601f83011215156103165760006000fd5b813561032961032482610de4565b610d41565b9150818183526020840193506020810190508360005b83811015610370578135860161035588826105d8565b8452602084019350602083019250505b60018101905061033f565b5050505092915050565b600082601f830112151561038e5760006000fd5b60026103a161039c82610e0d565b610d41565b915081838560408402820111156103b85760006000fd5b60005b838110156103e957816103ce88826106fe565b8452602084019350604083019250505b6001810190506103bb565b5050505092915050565b600082601f83011215156104075760006000fd5b813561041a61041582610e30565b610d41565b915081818352602084019350602081019050838560408402820111156104405760006000fd5b60005b83811015610471578161045688826106fe565b8452602084019350604083019250505b600181019050610443565b5050505092915050565b600082601f830112151561048f5760006000fd5b81356104a261049d82610e59565b610d41565b915081818352602084019350602081019050838560208402820111156104c85760006000fd5b60005b838110156104f957816104de8882610760565b8452602084019350602083019250505b6001810190506104cb565b5050505092915050565b600082601f83011215156105175760006000fd5b813561052a61052582610e82565b610d41565b915081818352602084019350602081019050838560208402820111156105505760006000fd5b60005b8381101561058157816105668882610760565b8452602084019350602083019250505b600181019050610553565b5050505092915050565b60006040828403121561059e5760006000fd5b6105a86040610d41565b905060006105b88482850161074b565b60008301525060206105cc8482850161074b565b60208301525092915050565b6000606082840312156105eb5760006000fd5b6105f56060610d41565b9050600061060584828501610760565b600083015250602082013567ffffffffffffffff8111156106265760006000fd5b6106328482850161047b565b602083015250604082013567ffffffffffffffff8111156106535760006000fd5b61065f848285016103f3565b60408301525092915050565b60006060828403121561067e5760006000fd5b6106886060610d41565b9050600061069884828501610760565b600083015250602082013567ffffffffffffffff8111156106b95760006000fd5b6106c58482850161047b565b602083015250604082013567ffffffffffffffff8111156106e65760006000fd5b6106f2848285016103f3565b60408301525092915050565b6000604082840312156107115760006000fd5b61071b6040610d41565b9050600061072b84828501610760565b600083015250602061073f84828501610760565b60208301525092915050565b60008135905061075a8161103a565b92915050565b60008135905061076f81611054565b92915050565b6000602082840312156107885760006000fd5b600082013567ffffffffffffffff8111156107a35760006000fd5b6107af8482850161027a565b91505092915050565b6000600060006000600060a086880312156107d35760006000fd5b600086013567ffffffffffffffff8111156107ee5760006000fd5b6107fa8882890161066b565b955050602086013567ffffffffffffffff8111156108185760006000fd5b61082488828901610189565b945050604086013567ffffffffffffffff8111156108425760006000fd5b61084e88828901610211565b935050606086013567ffffffffffffffff81111561086c5760006000fd5b61087888828901610302565b925050608086013567ffffffffffffffff8111156108965760006000fd5b6108a288828901610503565b9150509295509295909350565b60006108bb8383610a6a565b60808301905092915050565b60006108d38383610ac2565b905092915050565b60006108e78383610c36565b905092915050565b60006108fb8383610c8d565b60408301905092915050565b60006109138383610cbc565b60208301905092915050565b600061092a82610f0f565b6109348185610fb7565b935061093f83610eab565b8060005b8381101561097157815161095788826108af565b975061096283610f5c565b9250505b600181019050610943565b5085935050505092915050565b600061098982610f1a565b6109938185610fc8565b9350836020820285016109a585610ebb565b8060005b858110156109e257848403895281516109c285826108c7565b94506109cd83610f69565b925060208a019950505b6001810190506109a9565b50829750879550505050505092915050565b60006109ff82610f25565b610a098185610fd3565b935083602082028501610a1b85610ec5565b8060005b85811015610a585784840389528151610a3885826108db565b9450610a4383610f76565b925060208a019950505b600181019050610a1f565b50829750879550505050505092915050565b610a7381610f30565b610a7d8184610fe4565b9250610a8882610ed5565b8060005b83811015610aba578151610aa087826108ef565b9650610aab83610f83565b9250505b600181019050610a8c565b505050505050565b6000610acd82610f3b565b610ad78185610fef565b9350610ae283610edf565b8060005b83811015610b14578151610afa88826108ef565b9750610b0583610f90565b9250505b600181019050610ae6565b5085935050505092915050565b6000610b2c82610f51565b610b368185611011565b9350610b4183610eff565b8060005b83811015610b73578151610b598882610907565b9750610b6483610faa565b9250505b600181019050610b45565b5085935050505092915050565b6000610b8b82610f46565b610b958185611000565b9350610ba083610eef565b8060005b83811015610bd2578151610bb88882610907565b9750610bc383610f9d565b9250505b600181019050610ba4565b5085935050505092915050565b6000606083016000830151610bf76000860182610cbc565b5060208301518482036020860152610c0f8282610b80565b91505060408301518482036040860152610c298282610ac2565b9150508091505092915050565b6000606083016000830151610c4e6000860182610cbc565b5060208301518482036020860152610c668282610b80565b91505060408301518482036040860152610c808282610ac2565b9150508091505092915050565b604082016000820151610ca36000850182610cbc565b506020820151610cb66020850182610cbc565b50505050565b610cc581611030565b82525050565b600060a0820190508181036000830152610ce58188610bdf565b90508181036020830152610cf9818761091f565b90508181036040830152610d0d818661097e565b90508181036060830152610d2181856109f4565b90508181036080830152610d358184610b21565b90509695505050505050565b6000604051905081810181811067ffffffffffffffff82111715610d655760006000fd5b8060405250919050565b600067ffffffffffffffff821115610d875760006000fd5b602082029050602081019050919050565b600067ffffffffffffffff821115610db05760006000fd5b602082029050919050565b600067ffffffffffffffff821115610dd35760006000fd5b602082029050602081019050919050565b600067ffffffffffffffff821115610dfc5760006000fd5b602082029050602081019050919050565b600067ffffffffffffffff821115610e255760006000fd5b602082029050919050565b600067ffffffffffffffff821115610e485760006000fd5b602082029050602081019050919050565b600067ffffffffffffffff821115610e715760006000fd5b602082029050602081019050919050565b600067ffffffffffffffff821115610e9a5760006000fd5b602082029050602081019050919050565b6000819050602082019050919050565b6000819050919050565b6000819050602082019050919050565b6000819050919050565b6000819050602082019050919050565b6000819050602082019050919050565b6000819050602082019050919050565b600081519050919050565b600060029050919050565b600081519050919050565b600060029050919050565b600081519050919050565b600081519050919050565b600081519050919050565b6000602082019050919050565b6000602082019050919050565b6000602082019050919050565b6000602082019050919050565b6000602082019050919050565b6000602082019050919050565b6000602082019050919050565b600082825260208201905092915050565b600081905092915050565b600082825260208201905092915050565b600081905092915050565b600082825260208201905092915050565b600082825260208201905092915050565b600082825260208201905092915050565b600061ffff82169050919050565b6000819050919050565b61104381611022565b811415156110515760006000fd5b50565b61105d81611030565b8114151561106b5760006000fd5b50565bfea365627a7a72315820d78c6ba7ee332581e6c4d9daa5fc07941841230f7ce49edf6e05b1b63853e8746c6578706572696d656e74616cf564736f6c634300050c0040";

	// deploy deploys a new Ethereum contract, binding an instance of Tuple to it.
	public static Tuple deploy(TransactOpts auth, EthereumClient client) throws Exception {
		Interfaces args = Geth.newInterfaces(0);
		String bytecode = BYTECODE;


		return new Tuple(Geth.deployContract(auth, ABI, Geth.decodeFromHex(bytecode), client, args));
	}

	// Internal constructor used by contract deployment.
	private Tuple(BoundContract deployment) {
		this.Address  = deployment.getAddress();
		this.Deployer = deployment.getDeployer();
		this.Contract = deployment;
	}


	// Ethereum address where this contract is located at.
	public final Address Address;

	// Ethereum transaction in which this contract was deployed (if known!).
	public final Transaction Deployer;

	// Contract instance bound to a blockchain address.
	private final BoundContract Contract;

	// Creates a new instance of Tuple, bound to a specific deployed contract.
	public Tuple(Address address, EthereumClient client) throws Exception {
		this(Geth.bindContract(address, ABI, client));
	}

	public interface GoType {
		public Interfaces toGoInterfaces() throws Exception;
		public void fromGoInterfaces(Interfaces interfaces) throws Exception;
	}

	public static Interfaces toGoInterfaces(GoType in) throws Exception {
		if(in == null) {
			return Geth.newInterfaces(0);
		}
		return in.toGoInterfaces();
	}

	public static Interfaces toGoInterfaces(GoType[] in) throws Exception {
		if(in == null) {
			return Geth.newInterfaces(0);
		}
		Interfaces args = Geth.newInterfaces(in.length);
		for (int i = 0; i < in.length; i++) {
			args.setInterfaces(i, toGoInterfaces(in[i]));
		}
		return args;
	}

	public static Interfaces toGoInterfaces(GoType[][] in) throws Exception {
		if(in == null) {
			return Geth.newInterfaces(0);
		}
		Interfaces args = Geth.newInterfaces(in.length);
		for (int i = 0; i < in.length; i++) {
			args.setInterfaces(i, toGoInterfaces(in[i]));
		}
		return args;
	}

	// TupleP is an auto generated low-level Java binding around an user-defined struct.
	public class TupleP implements GoType {
		public BigInt x;
		public BigInt y;

		public TupleP() {
			this.x = new BigInt(0);
			this.y = new BigInt(0);
		}

		public Interfaces toGoInterfaces() throws Exception {
			Interfaces args = Geth.newInterfaces(2);
			Interface arg0 = Geth.newInterface(); arg0.setBigInt(x); args.set(0, arg0);
			Interface arg1 = Geth.newInterface(); arg1.setBigInt(y); args.set(1, arg1);
			return args;
		}

		public void fromGoInterfaces(Interfaces interfaces) throws Exception {
			this.x = interfaces.get(0).getBigInt();
			this.y = interfaces.get(1).getBigInt();
		}

	}

	// TupleQ is an auto generated low-level Java binding around an user-defined struct.
	public class TupleQ implements GoType {
		public BigInt x;
		public BigInt y;

		public Interfaces toGoInterfaces() throws Exception {
			Interfaces args = Geth.newInterfaces(2);
			Interface arg0 = Geth.newInterface(); arg0.setBigInt(x); args.set(0, arg0);
			Interface arg1 = Geth.newInterface(); arg1.setBigInt(y); args.set(1, arg1);
			return args;
		}

		public void fromGoInterfaces(Interfaces interfaces) throws Exception {
			this.x = interfaces.get(0).getBigInt();
			this.y = interfaces.get(1).getBigInt();
		}

	}

	// TupleT is an auto generated low-level Java binding around an user-defined struct.
	public class TupleT implements GoType {
		public BigInt x;
		public BigInt y;

		public Interfaces toGoInterfaces() throws Exception {
			Interfaces args = Geth.newInterfaces(2);
			Interface arg0 = Geth.newInterface(); arg0.setBigInt(x); args.set(0, arg0);
			Interface arg1 = Geth.newInterface(); arg1.setBigInt(y); args.set(1, arg1);
			return args;
		}

		public void fromGoInterfaces(Interfaces interfaces) throws Exception {
			this.x = interfaces.get(0).getBigInt();
			this.y = interfaces.get(1).getBigInt();
		}
	}

	// TupleS is an auto generated low-level Java binding around an user-defined struct.
	public class TupleS implements GoType {
		public BigInt a;
		public BigInts b;
		public TupleT[] c;

		public Interfaces toGoInterfaces() throws Exception {
			Interfaces args = Geth.newInterfaces(2);
			Interface arg0 = Geth.newInterface(); arg0.setBigInt(a); args.set(0, arg0);
			Interface arg1 = Geth.newInterface(); arg1.setBigInts(b); args.set(1, arg1);
			args.setInterfaces(2, Tuple.toGoInterfaces(c));
			return args;
		}

		public void fromGoInterfaces(Interfaces interfaces) throws Exception {
			this.a = interfaces.get(0).getBigInt();
			this.b = interfaces.get(1).getBigInts();
			Interfaces interfaces1 = interfaces.get(2).getInterfaces();
			this.c = new TupleT[(int)interfaces1.size()];
			for (int i = 0; i < interfaces1.size(); i++) {
				this.c[i].fromGoInterfaces(interfaces.get(i).getInterfaces());
			}
		}
	}

	// Func1Results is the output of a call to func1.
	public class Func1Results implements GoType {
		public TupleS Return0;
		public TupleT[][] Return1;
		public TupleT[][] Return2;
		public TupleS[] Return3;
		public BigInts Return4;

		public Interfaces toGoInterfaces() throws Exception {
			Interfaces args = Geth.newInterfaces(5);
			args.setInterfaces(0, Tuple.toGoInterfaces(Return0));
			args.setInterfaces(1, Tuple.toGoInterfaces(Return1));
			args.setInterfaces(2, Tuple.toGoInterfaces(Return2));
			args.setInterfaces(3, Tuple.toGoInterfaces(Return3));
			Interface arg4 = Geth.newInterface(); arg4.setBigInts(Return4); args.set(4,arg4);
			return args;
		}

		public void fromGoInterfaces(Interfaces interfaces) throws Exception {
			this.Return0.fromGoInterfaces(interfaces.get(0).getInterfaces());
			Interfaces interfaces1 = interfaces.get(1).getInterfaces();
			this.Return1 = new TupleT[(int) interfaces1.size()][];
			for (int i = 0; i < interfaces1.size(); i++) {
				Interfaces interfaces2 = interfaces1.get(i).getInterfaces();
				this.Return1[i] = new TupleT[(int) interfaces2.size()];
				for (int k = 0; k < interfaces2.size(); i++) {
					this.Return1[i][k].fromGoInterfaces(interfaces2.get(k).getInterfaces());
				}
			}
			Interfaces interfaces3 = interfaces.get(2).getInterfaces();
			this.Return2 = new TupleT[(int) interfaces3.size()][];
			for (int i = 0; i < interfaces3.size(); i++) {
				Interfaces interfaces4 = interfaces3.get(i).getInterfaces();
				this.Return2[i] = new TupleT[(int) interfaces4.size()];
				for (int k = 0; k < interfaces4.size(); i++) {
					this.Return2[i][k].fromGoInterfaces(interfaces4.get(k).getInterfaces());
				}
			}
			Interfaces interfaces5 = interfaces.get(3).getInterfaces();
			this.Return3 = new TupleS[(int) interfaces5.size()];
			for (int i = 0; i < interfaces5.size(); i++) {
				Interfaces interfaces4 = interfaces5.get(i).getInterfaces();
				this.Return3[i].fromGoInterfaces(interfaces4);
			}
			this.Return4 = interfaces.get(4).getBigInts();
		}

	}


	// func1 is a free data retrieval call binding the contract method 0x443c79b4.
	//
	// Solidity: function func1((uint256,uint256[],(uint256,uint256)[]) a, (uint256,uint256)[2][] b, (uint256,uint256)[][2] c, (uint256,uint256[],(uint256,uint256)[])[] d, uint256[] e) pure returns((uint256,uint256[],(uint256,uint256)[]), (uint256,uint256)[2][], (uint256,uint256)[][2], (uint256,uint256[],(uint256,uint256)[])[], uint256[])
	public Func1Results func1(CallOpts opts, TupleS a, TupleT[][] b, TupleT[][] c, TupleS[] d, BigInts e) throws Exception {
		Interfaces args = Geth.newInterfaces(5);
		args.setInterfaces(0, Tuple.toGoInterfaces(a));
		args.setInterfaces(1, Tuple.toGoInterfaces(b));
		args.setInterfaces(2, Tuple.toGoInterfaces(c));
		args.setInterfaces(3, Tuple.toGoInterfaces(d));
		Interface arg4 = Geth.newInterface();arg4.setBigInts(e);args.set(4,arg4);


		Func1Results res = new Func1Results();
		Interfaces results = res.toGoInterfaces();

		if (opts == null) {
			opts = Geth.newCallOpts();
		}
		this.Contract.call(opts, results, "func1", args);


		//res.fromGoInterfaces(results);
		return res;

	}



	// func3 is a free data retrieval call binding the contract method 0xe4d9a43b.
	//
	// Solidity: function func3((uint16,uint16)[] ) pure returns()
	public void func3(CallOpts opts, TupleQ[] arg0) throws Exception { //TODO unnamed args interfere with logic
		Interfaces args = Geth.newInterfaces(1);
		//Interface argk = Geth.newInterface();argk.setUint16(arg0);args.set(0,argk);


		Interfaces results = Geth.newInterfaces(0);


		if (opts == null) {
			opts = Geth.newCallOpts();
		}
		this.Contract.call(opts, results, "func3", args);


	}



	// func2 is a paid mutator transaction binding the contract method 0xd0062cdd.
	//
	// Solidity: function func2((uint256,uint256[],(uint256,uint256)[]) a, (uint256,uint256)[2][] b, (uint256,uint256)[][2] c, (uint256,uint256[],(uint256,uint256)[])[] d, uint256[] e) returns()
	public Transaction func2(TransactOpts opts, TupleS a, TupleT[][] b, TupleT[][] c, TupleS[] d, BigInts e) throws Exception {
		Interfaces args = Geth.newInterfaces(5);/*
		Interface arg0 = Geth.newInterface();arg0.setTupleS(a);args.set(0,arg0);
		Interface arg1 = Geth.newInterface();arg1.setTupleT[][](b);args.set(1,arg1);
		Interface arg2 = Geth.newInterface();arg2.setTupleT[][](c);args.set(2,arg2);
		Interface arg3 = Geth.newInterface();arg3.setTupleS[](d);args.set(3,arg3);
		Interface arg4 = Geth.newInterface();arg4.setBigInts(e);args.set(4,arg4);
*/
		return this.Contract.transact(opts, "func2"	, args);
	}





}

