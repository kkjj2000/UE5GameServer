import os
import re
import shutil

command_list = []

temp_cpp_dir = "CppDir"
temp_java_dir = "JavaDir"

package_cpp = "ProtoModel"
package_java = "com.fuxin.common.proto"

output_cpp = "D:\\Unreal Projects\\SocketServerDemo\\Source\\SocketServerDemo\\ProtoModel"
output_java = "D:\\Unreal Projects\\UE5GameServer\\Common\\src\\main\\java"


def replace_file(filepath, old_txt, new_txt):
    f = open(filepath, 'r')
    all_lines = f.readlines()
    f.close()
    f = open(filepath, 'w+')
    for each_line in all_lines:
        content = re.sub(old_txt, new_txt, each_line)
        f.writelines(content)
    f.close()


def delete_old_file():
    file_dir = os.getcwd()
    if os.path.exists(file_dir + "\\" + temp_cpp_dir): shutil.rmtree(file_dir + "\\" + temp_cpp_dir)
    if os.path.exists(file_dir + "\\" + temp_java_dir): shutil.rmtree(file_dir + "\\" + temp_java_dir)


def execute_command():
    for command in command_list:
        print(command)
        os.system(command)


def generate_class_file():
    os.mkdir(temp_cpp_dir)
    os.mkdir(temp_java_dir)

    file_dir = os.getcwd()
    file_list = os.listdir()
    for file_name in file_list:
        if file_name.endswith(".proto"):
            command_list.append(process_cpp_class(file_dir, file_name))
            command_list.append(process_java_class(file_dir, file_name))


def process_java_class(file_dir, file_name):
    source_file_path = file_dir + "\\" + file_name
    target_file_path = file_dir + "\\" + temp_java_dir + "\\" + file_name
    shutil.copy(source_file_path, target_file_path)
    replace_file(target_file_path, "PackageName", package_java)
    return "AProtoc.exe --proto_path \"" + file_dir + "\\" + temp_java_dir + "\" --java_out=\"" + output_java + "\" \"" + target_file_path + "\""


def process_cpp_class(file_dir, file_name):
    source_file_path = file_dir + "\\" + file_name
    target_file_path = file_dir + "\\" + temp_cpp_dir + "\\" + file_name
    shutil.copy(source_file_path, target_file_path)
    replace_file(target_file_path, "PackageName", package_cpp)
    return "AProtoc.exe --proto_path \"" + file_dir + "\\" + temp_cpp_dir + "\" --cpp_out=\"" + output_cpp + "\" \"" + target_file_path + "\""


if __name__ == '__main__':
    generate_class_file()
    execute_command()
    delete_old_file()
